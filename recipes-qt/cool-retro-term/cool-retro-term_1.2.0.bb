DESCRIPTION = "Terminal emulator which mimics the look and feel of the old cathode tube screens"
HOMEPAGE = "https://github.com/Swordfish90/cool-retro-term"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://gpl-3.0.txt;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5

SRC_URI = " \
  gitsm://github.com/Swordfish90/cool-retro-term.git;protocol=https;branch=master \
  file://qmltermwidget-0.2.0-gcc-10.patch \
"
SRCREV = "f157648d1e51878a10e02a8836c1e15aa8c59cc9"

S = "${WORKDIR}/git"

FILES:${PN} += " \
  ${bindir}/cool-retro-term \
  ${datadir}/applications \
  ${datadir}/icons \
  ${libdir}/qml \
"

DEPENDS = "qtdeclarative qtquickcontrols qtquickcontrols2 qtgraphicaleffects"
RDEPENDS:${PN} = "liberation-fonts qtquickcontrols qtquickcontrols2 qtdeclarative-qmlplugins qtgraphicaleffects-qmlplugins"
