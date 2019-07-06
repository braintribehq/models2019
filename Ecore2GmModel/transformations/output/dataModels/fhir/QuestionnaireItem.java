/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type QuestionnaireItem of the Data Model fhir.
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
{@link code}, 
{@link enableWhen}, 
{@link answerOption}, 
{@link initial}, 
{@link item}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getEnableWhen},
{@link getAnswerOption},
{@link getInitial},
{@link getItem},
{@link setCode},
{@link setEnableWhen},
{@link setAnswerOption},
{@link setInitial},
{@link setItem},
 */

@Description("A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.")

public interface QuestionnaireItem extends GenericEntity, fhir.BackboneElement {

	EntityType<QuestionnaireItem> T = EntityTypes.T(QuestionnaireItem.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String enableWhen = "enableWhen";
	java.lang.String answerOption = "answerOption";
	java.lang.String initial = "initial";
	java.lang.String item = "item";

	@Description("A terminology code that corresponds to this group or question (e.g. a code from LOINC, which defines many questions and answers).")
	
	java.util.List<fhir.Coding> getCode();
	void setCode(java.util.List<fhir.Coding> code);

	@Description("A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.")
	
	java.util.List<fhir.QuestionnaireEnableWhen> getEnableWhen();
	void setEnableWhen(java.util.List<fhir.QuestionnaireEnableWhen> enableWhen);

	@Description("One of the permitted answers for a 'choice' or 'open-choice' question.")
	
	java.util.List<fhir.QuestionnaireAnswerOption> getAnswerOption();
	void setAnswerOption(java.util.List<fhir.QuestionnaireAnswerOption> answerOption);

	@Description("One or more values that should be pre-populated in the answer when initially rendering the questionnaire for user input.")
	
	java.util.List<fhir.QuestionnaireInitial> getInitial();
	void setInitial(java.util.List<fhir.QuestionnaireInitial> initial);

	@Description("Text, questions and other groups to be nested beneath a question or group.")
	
	java.util.List<fhir.QuestionnaireItem> getItem();
	void setItem(java.util.List<fhir.QuestionnaireItem> item);

}
