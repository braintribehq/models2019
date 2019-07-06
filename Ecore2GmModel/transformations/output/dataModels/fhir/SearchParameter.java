/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SearchParameter of the Data Model fhir.
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
{@link jurisdiction}, 
{@link component}, 

* It provides of then following operations (getters and setters)
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getComponent},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setComponent},
 */

@Description("A search parameter that defines a named search item that can be used to search/filter on a resource.If the element is present, it must have either a @value, an @id, or extensions")

public interface SearchParameter extends GenericEntity, fhir.FhirDomainResource {

	EntityType<SearchParameter> T = EntityTypes.T(SearchParameter.class);

	/* Constants for each property name. */
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String component = "component";

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate search parameter instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the search parameter is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("Used to define the parts of a composite search parameter.")
	
	java.util.List<fhir.SearchParameterComponent> getComponent();
	void setComponent(java.util.List<fhir.SearchParameterComponent> component);

}
