LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PR = "r3"

PACKAGECONFIG ??= "assets user"

PACKAGECONFIG[assets] = ",,"

RDEPENDS_${PN} = " \
  ${@bb.utils.contains('DISTRO_FEATURES', 'retroarch-automount', 'udev-extraconf', '', d)} \
  ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'retroarch-service', '', d)} \
  ${@bb.utils.contains('PACKAGECONFIG', 'assets', 'retroarch-assets', '', d)} \
  ${@bb.utils.contains('PACKAGECONFIG', 'user', 'retroarch-user', '', d)} \
  libretro-bundle \
  retroarch \
"

ALLOW_EMPTY_${PN} = "1"
