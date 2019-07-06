/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type OperationDefinition of the Data Model fhir.
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
{@link parameter}, 
{@link overload}, 

* It provides of then following operations (getters and setters)
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getParameter},
{@link getOverload},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setParameter},
{@link setOverload},
 */

@Description("A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).If the element is present, it must have either a @value, an @id, or extensions")

public interface OperationDefinition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<OperationDefinition> T = EntityTypes.T(OperationDefinition.class);

	/* Constants for each property name. */
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String parameter = "parameter";
	java.lang.String overload = "overload";

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate operation definition instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the operation definition is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("The parameters for the operation/query.")
	
	java.util.List<fhir.OperationDefinitionParameter> getParameter();
	void setParameter(java.util.List<fhir.OperationDefinitionParameter> parameter);

	@Description("Defines an appropriate combination of parameters to use when invoking this operation, to help code generators when generating overloaded parameter sets for this operation.")
	
	java.util.List<fhir.OperationDefinitionOverload> getOverload();
	void setOverload(java.util.List<fhir.OperationDefinitionOverload> overload);

}
