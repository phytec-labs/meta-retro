LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS_${PN} = " \
  beetle-gba-libretro \
  beetle-psx-libretro \
  dosbox-libretro \
  fceumm-libretro \
  genesis-plus-gx-libretro \
  mame2000-libretro \
  mame2003-libretro \
  mame2003-plus-libretro \
  mgba-libretro \
  mupen64plus-libretro \
  pcsx-rearmed-libretro \
  snes9x2002-libretro \
  snes9x2005-libretro \
  snes9x2010-libretro \
  vba-next-libretro \
"

#   flycast-libretro

ALLOW_EMPTY_${PN} = "1"