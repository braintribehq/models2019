/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type VerificationResult of the Data Model fhir.
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
{@link target}, 
{@link need}, 
{@link validationType}, 
{@link validationProcess}, 
{@link frequency}, 
{@link failureAction}, 
{@link primarySource}, 
{@link attestation}, 
{@link validator}, 

* It provides of then following operations (getters and setters)
{@link getTarget},
{@link getNeed},
{@link getValidationType},
{@link getValidationProcess},
{@link getFrequency},
{@link getFailureAction},
{@link getPrimarySource},
{@link getAttestation},
{@link getValidator},
{@link setTarget},
{@link setNeed},
{@link setValidationType},
{@link setValidationProcess},
{@link setFrequency},
{@link setFailureAction},
{@link setPrimarySource},
{@link setAttestation},
{@link setValidator},
 */

@Description("Describes validation requirements, source(s), status and dates for one or more elements.If the element is present, it must have either a @value, an @id, or extensions")

public interface VerificationResult extends GenericEntity, fhir.FhirDomainResource {

	EntityType<VerificationResult> T = EntityTypes.T(VerificationResult.class);

	/* Constants for each property name. */
	java.lang.String target = "target";
	java.lang.String need = "need";
	java.lang.String validationType = "validationType";
	java.lang.String validationProcess = "validationProcess";
	java.lang.String frequency = "frequency";
	java.lang.String failureAction = "failureAction";
	java.lang.String primarySource = "primarySource";
	java.lang.String attestation = "attestation";
	java.lang.String validator = "validator";

	@Description("A resource that was validated.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getTarget();
	void setTarget(java.util.List<com.braintribe.model.generic.GenericEntity> target);

	@Description("The frequency with which the target must be validated (none; initial; periodic).")
	@Mandatory
	fhir.CodeableConcept getNeed();
	void setNeed(fhir.CodeableConcept need);
	@Description("What the target is validated against (nothing; primary source; multiple sources).")
	@Mandatory
	fhir.CodeableConcept getValidationType();
	void setValidationType(fhir.CodeableConcept validationType);
	@Description("The primary process by which the target is validated (edit check; value set; primary source; multiple sources; standalone; in context).")
	
	java.util.List<fhir.CodeableConcept> getValidationProcess();
	void setValidationProcess(java.util.List<fhir.CodeableConcept> validationProcess);

	@Description("Frequency of revalidation.")
	@Mandatory
	fhir.Timing getFrequency();
	void setFrequency(fhir.Timing frequency);
	@Description("The result if validation fails (fatal; warning; record only; none).")
	@Mandatory
	fhir.CodeableConcept getFailureAction();
	void setFailureAction(fhir.CodeableConcept failureAction);
	@Description("Information about the primary source(s) involved in validation.")
	
	java.util.List<fhir.VerificationResultPrimarySource> getPrimarySource();
	void setPrimarySource(java.util.List<fhir.VerificationResultPrimarySource> primarySource);

	@Description("Information about the entity attesting to information.")
	@Mandatory
	fhir.VerificationResultAttestation getAttestation();
	void setAttestation(fhir.VerificationResultAttestation attestation);
	@Description("Information about the entity validating information.")
	
	java.util.List<fhir.VerificationResultValidator> getValidator();
	void setValidator(java.util.List<fhir.VerificationResultValidator> validator);

}
