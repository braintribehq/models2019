/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type GuidanceResponse of the Data Model fhir.
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
{@link requestIdentifier}, 
{@link identifier}, 
{@link moduleCodeableConcept}, 
{@link subject}, 
{@link encounter}, 
{@link performer}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link note}, 
{@link evaluationMessage}, 
{@link outputParameters}, 
{@link result}, 
{@link dataRequirement}, 

* It provides of then following operations (getters and setters)
{@link getRequestIdentifier},
{@link getIdentifier},
{@link getModuleCodeableConcept},
{@link getSubject},
{@link getEncounter},
{@link getPerformer},
{@link getReasonCode},
{@link getReasonReference},
{@link getNote},
{@link getEvaluationMessage},
{@link getOutputParameters},
{@link getResult},
{@link getDataRequirement},
{@link setRequestIdentifier},
{@link setIdentifier},
{@link setModuleCodeableConcept},
{@link setSubject},
{@link setEncounter},
{@link setPerformer},
{@link setReasonCode},
{@link setReasonReference},
{@link setNote},
{@link setEvaluationMessage},
{@link setOutputParameters},
{@link setResult},
{@link setDataRequirement},
 */

@Description("A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.If the element is present, it must have either a @value, an @id, or extensions")

public interface GuidanceResponse extends GenericEntity, fhir.FhirDomainResource {

	EntityType<GuidanceResponse> T = EntityTypes.T(GuidanceResponse.class);

	/* Constants for each property name. */
	java.lang.String requestIdentifier = "requestIdentifier";
	java.lang.String identifier = "identifier";
	java.lang.String moduleCodeableConcept = "moduleCodeableConcept";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String performer = "performer";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String note = "note";
	java.lang.String evaluationMessage = "evaluationMessage";
	java.lang.String outputParameters = "outputParameters";
	java.lang.String result = "result";
	java.lang.String dataRequirement = "dataRequirement";

	@Description("The identifier of the request associated with this response. If an identifier was given as part of the request, it will be reproduced here to enable the requester to more easily identify the response in a multi-request scenario.")
	@Mandatory
	fhir.Identifier getRequestIdentifier();
	void setRequestIdentifier(fhir.Identifier requestIdentifier);
	@Description("Allows a service to provide  unique, business identifiers for the response.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("")
	@Mandatory
	fhir.CodeableConcept getModuleCodeableConcept();
	void setModuleCodeableConcept(fhir.CodeableConcept moduleCodeableConcept);
	@Description("The patient for which the request was processed.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The encounter during which this response was created or to which the creation of this record is tightly associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("Provides a reference to the device that performed the guidance.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPerformer();
	void setPerformer(com.braintribe.model.generic.GenericEntity performer);
	@Description("Describes the reason for the guidance response in coded or textual form.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Provides a mechanism to communicate additional information about the response.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEvaluationMessage();
	void setEvaluationMessage(java.util.List<com.braintribe.model.generic.GenericEntity> evaluationMessage);

	@Description("The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOutputParameters();
	void setOutputParameters(com.braintribe.model.generic.GenericEntity outputParameters);
	@Description("The actions, if any, produced by the evaluation of the artifact.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getResult();
	void setResult(com.braintribe.model.generic.GenericEntity result);
	@Description("If the evaluation could not be completed due to lack of information, or additional information would potentially result in a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A subsequent request to the service should include this data.")
	
	java.util.List<fhir.DataRequirement> getDataRequirement();
	void setDataRequirement(java.util.List<fhir.DataRequirement> dataRequirement);

}
