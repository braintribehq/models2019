/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type NamingSystem of the Data Model fhir.
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
{@link contact}, 
{@link type}, 
{@link useContext}, 
{@link jurisdiction}, 
{@link uniqueId}, 

* It provides of then following operations (getters and setters)
{@link getContact},
{@link getType},
{@link getUseContext},
{@link getJurisdiction},
{@link getUniqueId},
{@link setContact},
{@link setType},
{@link setUseContext},
{@link setJurisdiction},
{@link setUniqueId},
 */

@Description("A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a 'System' used within the Identifier and Coding data types.If the element is present, it must have either a @value, an @id, or extensions")

public interface NamingSystem extends GenericEntity, fhir.FhirDomainResource {

	EntityType<NamingSystem> T = EntityTypes.T(NamingSystem.class);

	/* Constants for each property name. */
	java.lang.String contact = "contact";
	java.lang.String type = "type";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String uniqueId = "uniqueId";

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("Categorizes a naming system for easier search by grouping related naming systems.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate naming system instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the naming system is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("Indicates how the system may be identified when referenced in electronic exchange.")
	
	java.util.List<fhir.NamingSystemUniqueId> getUniqueId();
	void setUniqueId(java.util.List<fhir.NamingSystemUniqueId> uniqueId);

}
