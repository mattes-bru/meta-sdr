SUMMARY = "GNU Radio Event Stream"
HOMEPAGE = "https://github.com/osh/gr-eventstream"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://README;md5=94b072ac07d7c0f9b55acc17dc656824"

DEPENDS = "gnuradio log4cpp swig-native"

inherit distutils-base cmake pkgconfig

export BUILD_SYS
export HOST_SYS="${MULTIMACH_TARGET_SYS}"

FILES_SOLIBSDEV = ""
FILES_${PN} += "${datadir}/gnuradio/grc/blocks/* ${libdir}/*.so"

PV = "0.0.5+git${SRCPV}"

SRC_URI = "git://github.com/osh/gr-eventstream;branch=master \
          "
S = "${WORKDIR}/git"

SRCREV = "cb02220b7b28048565196f782ee81045e4d366c0"

