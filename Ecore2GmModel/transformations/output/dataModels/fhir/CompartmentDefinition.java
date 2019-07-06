/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CompartmentDefinition of the Data Model fhir.
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
{@link useContext}, 
{@link resource}, 

* It provides of then following operations (getters and setters)
{@link getContact},
{@link getUseContext},
{@link getResource},
{@link setContact},
{@link setUseContext},
{@link setResource},
 */

@Description("A compartment definition that defines how resources are accessed on a server.If the element is present, it must have either a @value, an @id, or extensions")

public interface CompartmentDefinition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<CompartmentDefinition> T = EntityTypes.T(CompartmentDefinition.class);

	/* Constants for each property name. */
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String resource = "resource";

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate compartment definition instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("Information about how a resource is related to the compartment.")
	
	java.util.List<fhir.FhirCompartmentDefinitionResource> getResource();
	void setResource(java.util.List<fhir.FhirCompartmentDefinitionResource> resource);

}
