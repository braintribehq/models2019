/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type QuestionnaireEnableWhen of the Data Model fhir.
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
{@link answerCoding}, 
{@link answerQuantity}, 
{@link answerReference}, 

* It provides of then following operations (getters and setters)
{@link getAnswerCoding},
{@link getAnswerQuantity},
{@link getAnswerReference},
{@link setAnswerCoding},
{@link setAnswerQuantity},
{@link setAnswerReference},
 */

@Description("A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.")

public interface QuestionnaireEnableWhen extends GenericEntity, fhir.BackboneElement {

	EntityType<QuestionnaireEnableWhen> T = EntityTypes.T(QuestionnaireEnableWhen.class);

	/* Constants for each property name. */
	java.lang.String answerCoding = "answerCoding";
	java.lang.String answerQuantity = "answerQuantity";
	java.lang.String answerReference = "answerReference";

	@Description("")
	@Mandatory
	fhir.Coding getAnswerCoding();
	void setAnswerCoding(fhir.Coding answerCoding);
	@Description("")
	@Mandatory
	fhir.Quantity getAnswerQuantity();
	void setAnswerQuantity(fhir.Quantity answerQuantity);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAnswerReference();
	void setAnswerReference(com.braintribe.model.generic.GenericEntity answerReference);
}
