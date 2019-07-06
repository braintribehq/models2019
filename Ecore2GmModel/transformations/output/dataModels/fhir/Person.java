/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Person of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link identifier}, 
{@link name}, 
{@link telecom}, 
{@link address}, 
{@link photo}, 
{@link managingOrganization}, 
{@link link}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getName},
{@link getTelecom},
{@link getAddress},
{@link getPhoto},
{@link getManagingOrganization},
{@link getLink},
{@link setIdentifier},
{@link setName},
{@link setTelecom},
{@link setAddress},
{@link setPhoto},
{@link setManagingOrganization},
{@link setLink},
 */

@Description("Demographics and administrative information about a person independent of a specific health-related context.If the element is present, it must have either a @value, an @id, or extensions")

public interface Person extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Person> T = EntityTypes.T(Person.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String name = "name";
	java.lang.String telecom = "telecom";
	java.lang.String address = "address";
	java.lang.String photo = "photo";
	java.lang.String managingOrganization = "managingOrganization";
	java.lang.String link = "link";

	@Description("Identifier for a person within a particular scope.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A name associated with the person.")
	
	java.util.List<fhir.HumanName> getName();
	void setName(java.util.List<fhir.HumanName> name);

	@Description("A contact detail for the person, e.g. a telephone number or an email address.")
	
	java.util.List<fhir.ContactPoint> getTelecom();
	void setTelecom(java.util.List<fhir.ContactPoint> telecom);

	@Description("One or more addresses for the person.")
	
	java.util.List<fhir.Address> getAddress();
	void setAddress(java.util.List<fhir.Address> address);

	@Description("An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.")
	@Mandatory
	fhir.Attachment getPhoto();
	void setPhoto(fhir.Attachment photo);
	@Description("The organization that is the custodian of the person record.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getManagingOrganization();
	void setManagingOrganization(com.braintribe.model.generic.GenericEntity managingOrganization);
	@Description("Link to a resource that concerns the same actual person.")
	
	java.util.List<fhir.PersonLink> getLink();
	void setLink(java.util.List<fhir.PersonLink> link);

}
