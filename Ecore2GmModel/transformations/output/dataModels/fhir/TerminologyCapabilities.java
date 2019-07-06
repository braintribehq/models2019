/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TerminologyCapabilities of the Data Model fhir.
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
{@link software}, 
{@link implementation}, 
{@link codeSystem}, 
{@link expansion}, 
{@link validateCode}, 
{@link translation}, 
{@link closure}, 

* It provides of then following operations (getters and setters)
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getSoftware},
{@link getImplementation},
{@link getCodeSystem},
{@link getExpansion},
{@link getValidateCode},
{@link getTranslation},
{@link getClosure},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setSoftware},
{@link setImplementation},
{@link setCodeSystem},
{@link setExpansion},
{@link setValidateCode},
{@link setTranslation},
{@link setClosure},
 */

@Description("A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.If the element is present, it must have either a @value, an @id, or extensions")

public interface TerminologyCapabilities extends GenericEntity, fhir.FhirDomainResource {

	EntityType<TerminologyCapabilities> T = EntityTypes.T(TerminologyCapabilities.class);

	/* Constants for each property name. */
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String software = "software";
	java.lang.String implementation = "implementation";
	java.lang.String codeSystem = "codeSystem";
	java.lang.String expansion = "expansion";
	java.lang.String validateCode = "validateCode";
	java.lang.String translation = "translation";
	java.lang.String closure = "closure";

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate terminology capabilities instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the terminology capabilities is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("Software that is covered by this terminology capability statement.  It is used when the statement describes the capabilities of a particular software version, independent of an installation.")
	@Mandatory
	fhir.TerminologyCapabilitiesSoftware getSoftware();
	void setSoftware(fhir.TerminologyCapabilitiesSoftware software);
	@Description("Identifies a specific implementation instance that is described by the terminology capability statement - i.e. a particular installation, rather than the capabilities of a software program.")
	@Mandatory
	fhir.TerminologyCapabilitiesImplementation getImplementation();
	void setImplementation(fhir.TerminologyCapabilitiesImplementation implementation);
	@Description("Identifies a code system that is supported by the server. If there is a no code system URL, then this declares the general assumptions a client can make about support for any CodeSystem resource.")
	
	java.util.List<fhir.TerminologyCapabilitiesCodeSystem> getCodeSystem();
	void setCodeSystem(java.util.List<fhir.TerminologyCapabilitiesCodeSystem> codeSystem);

	@Description("Information about the [ValueSet/$expand](valueset-operation-expand.html) operation.")
	@Mandatory
	fhir.TerminologyCapabilitiesExpansion getExpansion();
	void setExpansion(fhir.TerminologyCapabilitiesExpansion expansion);
	@Description("Information about the [ValueSet/$validate-code](valueset-operation-validate-code.html) operation.")
	@Mandatory
	fhir.TerminologyCapabilitiesValidateCode getValidateCode();
	void setValidateCode(fhir.TerminologyCapabilitiesValidateCode validateCode);
	@Description("Information about the [ConceptMap/$translate](conceptmap-operation-translate.html) operation.")
	@Mandatory
	fhir.TerminologyCapabilitiesTranslation getTranslation();
	void setTranslation(fhir.TerminologyCapabilitiesTranslation translation);
	@Description("Whether the $closure operation is supported.")
	@Mandatory
	fhir.TerminologyCapabilitiesClosure getClosure();
	void setClosure(fhir.TerminologyCapabilitiesClosure closure);
}
