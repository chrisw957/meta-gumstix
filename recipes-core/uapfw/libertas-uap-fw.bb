DESCRIPTION = "Libertas UAP Firmware"
PR = "r2"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://licenses/GPL-2;md5=94d55d512a9ba36caa9b7df079bae19f"

SRC_URI = "file://helper_sd.bin \
           file://sd8686_ap.bin \
           file://licenses/GPL-2 \
          "

S = "${WORKDIR}"

do_install () {
	install -d ${D}/lib/firmware/mrvl
        install -m 0755 ${WORKDIR}/helper_sd.bin ${D}/lib/firmware/mrvl
        install -m 0755 ${WORKDIR}/sd8686_ap.bin ${D}/lib/firmware/mrvl
}

FILES_${PN} += "/lib/firmware/mrvl"

PACKAGE_ARCH = "${MACHINE_ARCH}"


