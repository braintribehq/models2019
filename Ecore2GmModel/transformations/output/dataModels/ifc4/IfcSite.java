/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSite of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link RefLatitude}, 
{@link RefLongitude}, 
{@link RefElevation}, 
{@link RefElevationAsString}, 
{@link LandTitleNumber}, 
{@link SiteAddress}, 

* It provides of then following operations (getters and setters)
{@link getRefLatitude},
{@link getRefLongitude},
{@link getRefElevation},
{@link getRefElevationAsString},
{@link getLandTitleNumber},
{@link getSiteAddress},
{@link setRefLatitude},
{@link setRefLongitude},
{@link setRefElevation},
{@link setRefElevationAsString},
{@link setLandTitleNumber},
{@link setSiteAddress},
 */

@Description("")

public interface IfcSite extends GenericEntity, ifc4.IfcSpatialStructureElement {

	EntityType<IfcSite> T = EntityTypes.T(IfcSite.class);

	/* Constants for each property name. */
	java.lang.String RefLatitude = "RefLatitude";
	java.lang.String RefLongitude = "RefLongitude";
	java.lang.String RefElevation = "RefElevation";
	java.lang.String RefElevationAsString = "RefElevationAsString";
	java.lang.String LandTitleNumber = "LandTitleNumber";
	java.lang.String SiteAddress = "SiteAddress";

	@Description("")
	@Mandatory
	java.util.List<java.lang.Long> getRefLatitude();
	void setRefLatitude(java.util.List<java.lang.Long> RefLatitude);

	@Description("")
	@Mandatory
	java.util.List<java.lang.Long> getRefLongitude();
	void setRefLongitude(java.util.List<java.lang.Long> RefLongitude);

	@Description("")
	@Mandatory
	java.lang.Double getRefElevation();
	void setRefElevation(java.lang.Double RefElevation);
	@Description("")
	@Mandatory
	java.lang.String getRefElevationAsString();
	void setRefElevationAsString(java.lang.String RefElevationAsString);
	@Description("")
	@Mandatory
	java.lang.String getLandTitleNumber();
	void setLandTitleNumber(java.lang.String LandTitleNumber);
	@Description("")
	@Mandatory
	ifc4.IfcPostalAddress getSiteAddress();
	void setSiteAddress(ifc4.IfcPostalAddress SiteAddress);
}
