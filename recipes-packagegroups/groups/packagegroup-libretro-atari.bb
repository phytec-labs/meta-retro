DESCRIPTION = "Libretro Atari cores"

inherit retro-packagegroup

# TODO: hatari-libretro fails with GCC 10.1

LIBRETRO_ATARI_CORES ?= " \
  atari800-libretro \
  beetle-lynx-libretro \
  handy-libretro \
  prosystem-libretro \
  puae-libretro \
  stella2014-libretro \
  virtualjaguar-libretro \
"

LIBRETRO_ATARI_CORES:remove:armarch = "puae-libretro"

RRECOMMENDS:${PN} = "${LIBRETRO_ATARI_CORES}"
