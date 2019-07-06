/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type QuestionnaireAnswerOption of the Data Model fhir.
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
{@link valueCoding}, 
{@link valueReference}, 

* It provides of then following operations (getters and setters)
{@link getValueCoding},
{@link getValueReference},
{@link setValueCoding},
{@link setValueReference},
 */

@Description("A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.")

public interface QuestionnaireAnswerOption extends GenericEntity, fhir.BackboneElement {

	EntityType<QuestionnaireAnswerOption> T = EntityTypes.T(QuestionnaireAnswerOption.class);

	/* Constants for each property name. */
	java.lang.String valueCoding = "valueCoding";
	java.lang.String valueReference = "valueReference";

	@Description("")
	@Mandatory
	fhir.Coding getValueCoding();
	void setValueCoding(fhir.Coding valueCoding);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getValueReference();
	void setValueReference(com.braintribe.model.generic.GenericEntity valueReference);
}
