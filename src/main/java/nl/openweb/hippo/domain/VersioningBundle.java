package nl.openweb.hippo.domain;

import javax.persistence.Entity;
import javax.persistence.Table;


import static nl.openweb.hippo.JackrabbitDatabaseDecoderApplication.VERSIONING_PREFIX;

/**
 * @author Ebrahim Aharpour
 * @since 11/19/2017
 */
@Entity
@Table(name = VERSIONING_PREFIX + "BUNDLE")
public class VersioningBundle extends Bundle {


}
