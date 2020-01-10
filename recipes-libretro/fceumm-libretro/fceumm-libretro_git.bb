LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit libretro

SRCREV = "${AUTOREV}"
SRC_URI = "gitsm://github.com/libretro/libretro-fceumm.git;protocol=https"
S = "${WORKDIR}/git"

LIBRETRO_CORE = "fceumm"
LIBRETRO_PLATFORM = "unix"

LIBRETRO_EXTRA_CFLAGS = "-std=gnu11"
LIBRETRO_EXTRA_CFLAGS_append_aarch64 = " -DARM"
LIBRETRO_EXTRA_CFLAGS_append_arm = " -DARM"
LIBRETRO_EXTRA_CXXFLAGS = "-std=gnu++11"
LIBRETRO_EXTRA_CXXFLAGS_append_aarch64 = " -DARM"
LIBRETRO_EXTRA_CXXFLAGS_append_arm = " -DARM"

LIBRETRO_EXTRA_MAKEFLAGS_append = " STATIC_LINKING=1 EXTERNAL_ZLIB=1"