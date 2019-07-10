/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Action of the Data Model uml.
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
{@link context}, 
{@link input}, 
{@link isLocallyReentrant}, 
{@link localPostcondition}, 
{@link localPrecondition}, 
{@link output}, 

* It provides of then following operations (getters and setters)
{@link getContext},
{@link getInput},
{@link getIsLocallyReentrant},
{@link getLocalPostcondition},
{@link getLocalPrecondition},
{@link getOutput},
{@link setContext},
{@link setInput},
{@link setIsLocallyReentrant},
{@link setLocalPostcondition},
{@link setLocalPrecondition},
{@link setOutput},
 */

@Description("An Action is the fundamental unit of executable functionality. The execution of an Action represents some transformation or processing in the modeled system. Actions provide the ExecutableNodes within Activities and may also be used within Interactions.<p>From package UML::Actions.</p>")
 
@Abstract 

public interface Action extends GenericEntity, uml.Executablenode {

	EntityType<Action> T = EntityTypes.T(Action.class);

	/* Constants for each property name. */
	java.lang.String context = "context";
	java.lang.String input = "input";
	java.lang.String isLocallyReentrant = "isLocallyReentrant";
	java.lang.String localPostcondition = "localPostcondition";
	java.lang.String localPrecondition = "localPrecondition";
	java.lang.String output = "output";

	@Description("The context Classifier of the Behavior that contains this Action, or the Behavior itself if it has no context.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Classifier getContext();
	void setContext(uml.Classifier context);
	@Description("The ordered set of InputPins representing the inputs to the Action.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Inputpin> getInput();
	void setInput(java.util.List<uml.Inputpin> input);

	@Description("If true, the Action can begin a new, concurrent execution, even if there is already another execution of the Action ongoing. If false, the Action cannot begin a new execution until any previous execution has completed.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsLocallyReentrant();
	void setIsLocallyReentrant(types.Boolean isLocallyReentrant);
	@Description("A Constraint that must be satisfied when execution of the Action is completed.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Constraint> getLocalPostcondition();
	void setLocalPostcondition(java.util.List<uml.Constraint> localPostcondition);

	@Description("A Constraint that must be satisfied when execution of the Action is started.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Constraint> getLocalPrecondition();
	void setLocalPrecondition(java.util.List<uml.Constraint> localPrecondition);

	@Description("The ordered set of OutputPins representing outputs from the Action.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Outputpin> getOutput();
	void setOutput(java.util.List<uml.Outputpin> output);

}
