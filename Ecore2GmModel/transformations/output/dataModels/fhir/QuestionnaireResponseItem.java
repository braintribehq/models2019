/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type QuestionnaireResponseItem of the Data Model fhir.
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
{@link answer}, 
{@link item}, 

* It provides of then following operations (getters and setters)
{@link getAnswer},
{@link getItem},
{@link setAnswer},
{@link setItem},
 */

@Description("A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.")

public interface QuestionnaireResponseItem extends GenericEntity, fhir.BackboneElement {

	EntityType<QuestionnaireResponseItem> T = EntityTypes.T(QuestionnaireResponseItem.class);

	/* Constants for each property name. */
	java.lang.String answer = "answer";
	java.lang.String item = "item";

	@Description("The respondent's answer(s) to the question.")
	
	java.util.List<fhir.QuestionnaireResponseAnswer> getAnswer();
	void setAnswer(java.util.List<fhir.QuestionnaireResponseAnswer> answer);

	@Description("Questions or sub-groups nested beneath a question or group.")
	
	java.util.List<fhir.QuestionnaireResponseItem> getItem();
	void setItem(java.util.List<fhir.QuestionnaireResponseItem> item);

}
