/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPostalAddress of the Data Model iai.
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
{@link InternalLocation}, 
{@link AddressLines}, 
{@link PostalBox}, 
{@link Town}, 
{@link Region}, 
{@link PostalCode}, 
{@link Country}, 

* It provides of then following operations (getters and setters)
{@link getInternalLocation},
{@link getAddressLines},
{@link getPostalBox},
{@link getTown},
{@link getRegion},
{@link getPostalCode},
{@link getCountry},
{@link setInternalLocation},
{@link setAddressLines},
{@link setPostalBox},
{@link setTown},
{@link setRegion},
{@link setPostalCode},
{@link setCountry},
 */

@Description("")

public interface IfcPostalAddress extends GenericEntity, ifc4.IfcAddress {

	EntityType<IfcPostalAddress> T = EntityTypes.T(IfcPostalAddress.class);

	/* Constants for each property name. */
	java.lang.String InternalLocation = "InternalLocation";
	java.lang.String AddressLines = "AddressLines";
	java.lang.String PostalBox = "PostalBox";
	java.lang.String Town = "Town";
	java.lang.String Region = "Region";
	java.lang.String PostalCode = "PostalCode";
	java.lang.String Country = "Country";

	@Description("")
	@Mandatory
	java.lang.String getInternalLocation();
	void setInternalLocation(java.lang.String InternalLocation);
	@Description("")
	
	java.util.List<java.lang.String> getAddressLines();
	void setAddressLines(java.util.List<java.lang.String> AddressLines);

	@Description("")
	@Mandatory
	java.lang.String getPostalBox();
	void setPostalBox(java.lang.String PostalBox);
	@Description("")
	@Mandatory
	java.lang.String getTown();
	void setTown(java.lang.String Town);
	@Description("")
	@Mandatory
	java.lang.String getRegion();
	void setRegion(java.lang.String Region);
	@Description("")
	@Mandatory
	java.lang.String getPostalCode();
	void setPostalCode(java.lang.String PostalCode);
	@Description("")
	@Mandatory
	java.lang.String getCountry();
	void setCountry(java.lang.String Country);
}
