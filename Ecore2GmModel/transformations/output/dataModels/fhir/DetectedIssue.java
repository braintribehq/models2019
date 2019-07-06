/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DetectedIssue of the Data Model fhir.
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
{@link code}, 
{@link patient}, 
{@link identifiedPeriod}, 
{@link author}, 
{@link implicated}, 
{@link evidence}, 
{@link mitigation}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCode},
{@link getPatient},
{@link getIdentifiedPeriod},
{@link getAuthor},
{@link getImplicated},
{@link getEvidence},
{@link getMitigation},
{@link setIdentifier},
{@link setCode},
{@link setPatient},
{@link setIdentifiedPeriod},
{@link setAuthor},
{@link setImplicated},
{@link setEvidence},
{@link setMitigation},
 */

@Description("Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.If the element is present, it must have either a @value, an @id, or extensions")

public interface DetectedIssue extends GenericEntity, fhir.FhirDomainResource {

	EntityType<DetectedIssue> T = EntityTypes.T(DetectedIssue.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String code = "code";
	java.lang.String patient = "patient";
	java.lang.String identifiedPeriod = "identifiedPeriod";
	java.lang.String author = "author";
	java.lang.String implicated = "implicated";
	java.lang.String evidence = "evidence";
	java.lang.String mitigation = "mitigation";

	@Description("Business identifier associated with the detected issue record.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Identifies the general type of issue identified.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("Indicates the patient whose record the detected issue is associated with.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("")
	@Mandatory
	fhir.Period getIdentifiedPeriod();
	void setIdentifiedPeriod(fhir.Period identifiedPeriod);
	@Description("Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthor();
	void setAuthor(com.braintribe.model.generic.GenericEntity author);
	@Description("Indicates the resource representing the current activity or proposed activity that is potentially problematic.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getImplicated();
	void setImplicated(java.util.List<com.braintribe.model.generic.GenericEntity> implicated);

	@Description("Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a GuidanceResponse or MeasureReport.")
	
	java.util.List<fhir.DetectedIssueEvidence> getEvidence();
	void setEvidence(java.util.List<fhir.DetectedIssueEvidence> evidence);

	@Description("Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.")
	
	java.util.List<fhir.DetectedIssueMitigation> getMitigation();
	void setMitigation(java.util.List<fhir.DetectedIssueMitigation> mitigation);

}
