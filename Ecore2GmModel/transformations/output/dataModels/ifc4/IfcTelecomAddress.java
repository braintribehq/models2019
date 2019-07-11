/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTelecomAddress of the Data Model iai.
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
{@link TelephoneNumbers}, 
{@link FacsimileNumbers}, 
{@link PagerNumber}, 
{@link ElectronicMailAddresses}, 
{@link WWWHomePageURL}, 
{@link MessagingIDs}, 

* It provides of then following operations (getters and setters)
{@link getTelephoneNumbers},
{@link getFacsimileNumbers},
{@link getPagerNumber},
{@link getElectronicMailAddresses},
{@link getWWWHomePageURL},
{@link getMessagingIDs},
{@link setTelephoneNumbers},
{@link setFacsimileNumbers},
{@link setPagerNumber},
{@link setElectronicMailAddresses},
{@link setWWWHomePageURL},
{@link setMessagingIDs},
 */

@Description("")

public interface IfcTelecomAddress extends GenericEntity, ifc4.IfcAddress {

	EntityType<IfcTelecomAddress> T = EntityTypes.T(IfcTelecomAddress.class);

	/* Constants for each property name. */
	java.lang.String TelephoneNumbers = "TelephoneNumbers";
	java.lang.String FacsimileNumbers = "FacsimileNumbers";
	java.lang.String PagerNumber = "PagerNumber";
	java.lang.String ElectronicMailAddresses = "ElectronicMailAddresses";
	java.lang.String WWWHomePageURL = "WWWHomePageURL";
	java.lang.String MessagingIDs = "MessagingIDs";

	@Description("")
	
	java.util.List<java.lang.String> getTelephoneNumbers();
	void setTelephoneNumbers(java.util.List<java.lang.String> TelephoneNumbers);

	@Description("")
	
	java.util.List<java.lang.String> getFacsimileNumbers();
	void setFacsimileNumbers(java.util.List<java.lang.String> FacsimileNumbers);

	@Description("")
	@Mandatory
	java.lang.String getPagerNumber();
	void setPagerNumber(java.lang.String PagerNumber);
	@Description("")
	
	java.util.List<java.lang.String> getElectronicMailAddresses();
	void setElectronicMailAddresses(java.util.List<java.lang.String> ElectronicMailAddresses);

	@Description("")
	@Mandatory
	java.lang.String getWWWHomePageURL();
	void setWWWHomePageURL(java.lang.String WWWHomePageURL);
	@Description("")
	
	java.util.List<java.lang.String> getMessagingIDs();
	void setMessagingIDs(java.util.List<java.lang.String> MessagingIDs);

}
