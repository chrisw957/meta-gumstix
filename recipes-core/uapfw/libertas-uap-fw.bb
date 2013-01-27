DESCRIPTION = "Libertas UAP Firmware"
PR = "r3"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENCE.Marvell;md5=9ddea1734a4baf3c78d845151f42a37a"

SRC_URI = "file://helper_sd.bin \
           file://sd8686_ap.bin \
           file://LICENCE.Marvell \
          "

S = "${WORKDIR}"

do_install () {
	install -d ${D}/lib/firmware/mrvl
        install -m 0755 ${WORKDIR}/helper_sd.bin ${D}/lib/firmware/mrvl
        install -m 0755 ${WORKDIR}/sd8686_ap.bin ${D}/lib/firmware/mrvl
}

FILES_${PN} += "/lib/firmware/mrvl"

PACKAGE_ARCH = "${MACHINE_ARCH}"

