DESCRIPTION = "Atari Jaguar emu - Virtual Jaguar (optimised) port for libretro"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://docs/GPLv3;md5=d32239bcb673463ab874e80d47fae504"

inherit libretro

LIBRETRO_GIT_REPO = "github.com/libretro/virtualjaguar-libretro.git"

# Prefer armv platform for 32-bit ARMs
LIBRETRO_PLATFORM:arm32 = "armv"
