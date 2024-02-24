SUMMARY = "Sony PlayStation emulator"
DESCRIPTION = "Sony PlayStation emulator - pcsx-rearmed"

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=5dd99a4a14d516c44d0779c1e819f963"

inherit libretro

LIBRETRO_GIT_REPO = "github.com/libretro/pcsx_rearmed.git"

PREFFERED_DYNAMIC_RECOMPILER ?= "lightrec"
PREFFERED_DYNAMIC_RECOMPILER:arm32 = "ari64"
PREFFERED_DYNAMIC_RECOMPILER = "ari64"

PREFFERED_BUILTIN_GPU ?= "${@bb.utils.contains('TUNE_FEATURES', 'neon', 'neon', 'peops', d)}"
PREFFERED_BUILTIN_GPU:arm64 = "unai"

PCSX_THREAD_RENDERING ?= "0"
PCSX_THREAD_RENDERING:arm64 = "1"

LIBRETRO_COMMON_FLAGS = "-fPIC -shared"

LIBRETRO_EXTRA_MAKEFLAGS += " \
	BUILTIN_GPU=${PREFFERED_BUILTIN_GPU} \
	DYNAREC=${PREFFERED_DYNAMIC_RECOMPILER} \
	THREAD_RENDERING=${PCSX_THREAD_RENDERING} \
"

TOOLCHAIN:forcevariable = "clang"

DEPENDS:append:toolchain-clang = " clang-cross-${TARGET_ARCH}"
KERNEL_CC:toolchain-clang = "${CCACHE}clang ${HOST_CC_KERNEL_ARCH} -fuse-ld=lld ${DEBUG_PREFIX_MAP} -fdebug-prefix-map=${STAGING_KERNEL_DIR}=${KERNEL_SRC_PATH}"
KERNEL_LD:toolchain-clang = "${CCACHE}ld.lld"
KERNEL_AR:toolchain-clang = "${CCACHE}llvm-ar"

CFLAGS += "-w"
CXXFLAGS += "-w"
