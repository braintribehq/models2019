/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExampleScenario of the Data Model fhir.
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
{@link contact}, 
{@link useContext}, 
{@link jurisdiction}, 
{@link actor}, 
{@link instance}, 
{@link process}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getActor},
{@link getInstance},
{@link getProcess},
{@link setIdentifier},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setActor},
{@link setInstance},
{@link setProcess},
 */

@Description("Example of workflow instance.If the element is present, it must have either a @value, an @id, or extensions")

public interface ExampleScenario extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ExampleScenario> T = EntityTypes.T(ExampleScenario.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String actor = "actor";
	java.lang.String instance = "instance";
	java.lang.String process = "process";

	@Description("A formal identifier that is used to identify this example scenario when it is represented in other formats, or referenced in a specification, model, design or an instance.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate example scenario instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the example scenario is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("Actor participating in the resource.")
	
	java.util.List<fhir.ExampleScenarioActor> getActor();
	void setActor(java.util.List<fhir.ExampleScenarioActor> actor);

	@Description("Each resource and each version that is present in the workflow.")
	
	java.util.List<fhir.ExampleScenarioInstance> getInstance();
	void setInstance(java.util.List<fhir.ExampleScenarioInstance> instance);

	@Description("Each major process - a group of operations.")
	
	java.util.List<fhir.ExampleScenarioProcess> getProcess();
	void setProcess(java.util.List<fhir.ExampleScenarioProcess> process);

}
