DESCRIPTION = "NDS emu - DESMUME (2015 version)"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://desmume/COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit libretro

DEPENDS += "libpcap libglu"

LIBRETRO_MAKEFILE_PREFIX = "desmume/src/frontend/libretro"
LIBRETRO_CORE_FILE_append = "2015"

LIBRETRO_PLATFORM_append_arm32 = " armv"
LIBRETRO_PLATFORM_append_opengles = " gles"

LIBRETRO_GIT_REPO = "github.com/libretro/desmume.git"
LIBRETRO_CORE = "desmume/src/frontend/libretro/desmume"

COMPATIBLE_MACHINE = "(-)"
COMPATIBLE_MACHINE_x86arch = "(.*)"
COMPATIBLE_MACHINE_arm32 = "(.*)"
