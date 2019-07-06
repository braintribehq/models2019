/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CapabilityStatement of the Data Model fhir.
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
{@link rest}, 
{@link messaging}, 
{@link document}, 

* It provides of then following operations (getters and setters)
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getSoftware},
{@link getImplementation},
{@link getRest},
{@link getMessaging},
{@link getDocument},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setSoftware},
{@link setImplementation},
{@link setRest},
{@link setMessaging},
{@link setDocument},
 */

@Description("A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.If the element is present, it must have either a @value, an @id, or extensions")

public interface CapabilityStatement extends GenericEntity, fhir.FhirDomainResource {

	EntityType<CapabilityStatement> T = EntityTypes.T(CapabilityStatement.class);

	/* Constants for each property name. */
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String software = "software";
	java.lang.String implementation = "implementation";
	java.lang.String rest = "rest";
	java.lang.String messaging = "messaging";
	java.lang.String document = "document";

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate capability statement instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the capability statement is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("Software that is covered by this capability statement.  It is used when the capability statement describes the capabilities of a particular software version, independent of an installation.")
	@Mandatory
	fhir.CapabilityStatementSoftware getSoftware();
	void setSoftware(fhir.CapabilityStatementSoftware software);
	@Description("Identifies a specific implementation instance that is described by the capability statement - i.e. a particular installation, rather than the capabilities of a software program.")
	@Mandatory
	fhir.CapabilityStatementImplementation getImplementation();
	void setImplementation(fhir.CapabilityStatementImplementation implementation);
	@Description("A definition of the restful capabilities of the solution, if any.")
	
	java.util.List<fhir.CapabilityStatementRest> getRest();
	void setRest(java.util.List<fhir.CapabilityStatementRest> rest);

	@Description("A description of the messaging capabilities of the solution.")
	
	java.util.List<fhir.CapabilityStatementMessaging> getMessaging();
	void setMessaging(java.util.List<fhir.CapabilityStatementMessaging> messaging);

	@Description("A document definition.")
	
	java.util.List<fhir.CapabilityStatementDocument> getDocument();
	void setDocument(java.util.List<fhir.CapabilityStatementDocument> document);

}
