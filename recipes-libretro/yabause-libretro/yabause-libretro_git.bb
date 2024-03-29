DESCRIPTION = "Sega Saturn emu - Yabause (optimised) port for libretro"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://yabause/COPYING;md5=4b446a5a0b773c458f6a5b3288522b62"

inherit libretro

LIBRETRO_PLATFORM:arm32 = "armv,unix"
LIBRETRO_PLATFORM:arm64 = "arm64,unix"

LIBRETRO_MAKEFILE_PREFIX = "yabause/src/libretro"
LIBRETRO_CORE = "yabause/src/libretro/yabause"
LIBRETRO_GIT_REPO = "github.com/libretro/yabause.git"
