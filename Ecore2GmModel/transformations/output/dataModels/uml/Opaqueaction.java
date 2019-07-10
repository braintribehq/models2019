/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Opaqueaction of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link body}, 
{@link inputValue}, 
{@link language}, 
{@link outputValue}, 

* It provides of then following operations (getters and setters)
{@link getBody},
{@link getInputValue},
{@link getLanguage},
{@link getOutputValue},
{@link setBody},
{@link setInputValue},
{@link setLanguage},
{@link setOutputValue},
 */

@Description("An OpaqueAction is an Action whose functionality is not specified within UML.<p>From package UML::Actions.</p>")

public interface Opaqueaction extends GenericEntity, uml.Action {

	EntityType<Opaqueaction> T = EntityTypes.T(Opaqueaction.class);

	/* Constants for each property name. */
	java.lang.String body = "body";
	java.lang.String inputValue = "inputValue";
	java.lang.String language = "language";
	java.lang.String outputValue = "outputValue";

	@Description("Provides a textual specification of the functionality of the Action, in one or more languages other than UML.<p>From package UML::Actions.</p>")
	
	java.util.List<types.String> getBody();
	void setBody(java.util.List<types.String> body);

	@Description("The InputPins providing inputs to the OpaqueAction.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Inputpin> getInputValue();
	void setInputValue(java.util.List<uml.Inputpin> inputValue);

	@Description("If provided, a specification of the language used for each of the body Strings.<p>From package UML::Actions.</p>")
	
	java.util.List<types.String> getLanguage();
	void setLanguage(java.util.List<types.String> language);

	@Description("The OutputPins on which the OpaqueAction provides outputs.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Outputpin> getOutputValue();
	void setOutputValue(java.util.List<uml.Outputpin> outputValue);

}
