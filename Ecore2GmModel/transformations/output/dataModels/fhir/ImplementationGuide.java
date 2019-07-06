/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ImplementationGuide of the Data Model fhir.
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
{@link dependsOn}, 
{@link global}, 
{@link definition}, 
{@link manifest}, 

* It provides of then following operations (getters and setters)
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getDependsOn},
{@link getGlobal},
{@link getDefinition},
{@link getManifest},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setDependsOn},
{@link setGlobal},
{@link setDefinition},
{@link setManifest},
 */

@Description("A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.If the element is present, it must have either a @value, an @id, or extensions")

public interface ImplementationGuide extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ImplementationGuide> T = EntityTypes.T(ImplementationGuide.class);

	/* Constants for each property name. */
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String dependsOn = "dependsOn";
	java.lang.String global = "global";
	java.lang.String definition = "definition";
	java.lang.String manifest = "manifest";

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate implementation guide instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the implementation guide is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.")
	
	java.util.List<fhir.ImplementationGuideDependsOn> getDependsOn();
	void setDependsOn(java.util.List<fhir.ImplementationGuideDependsOn> dependsOn);

	@Description("A set of profiles that all resources covered by this implementation guide must conform to.")
	
	java.util.List<fhir.ImplementationGuideGlobal> getGlobal();
	void setGlobal(java.util.List<fhir.ImplementationGuideGlobal> global);

	@Description("The information needed by an IG publisher tool to publish the whole implementation guide.")
	@Mandatory
	fhir.ImplementationGuideDefinition getDefinition();
	void setDefinition(fhir.ImplementationGuideDefinition definition);
	@Description("Information about an assembled implementation guide, created by the publication tooling.")
	@Mandatory
	fhir.ImplementationGuideManifest getManifest();
	void setManifest(fhir.ImplementationGuideManifest manifest);
}
