/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Replyaction of the Data Model uml.
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
{@link replyToCall}, 
{@link replyValue}, 
{@link returnInformation}, 

* It provides of then following operations (getters and setters)
{@link getReplyToCall},
{@link getReplyValue},
{@link getReturnInformation},
{@link setReplyToCall},
{@link setReplyValue},
{@link setReturnInformation},
 */

@Description("A ReplyAction is an Action that accepts a set of reply values and a value containing return information produced by a previous AcceptCallAction. The ReplyAction returns the values to the caller of the previous call, completing execution of the call.<p>From package UML::Actions.</p>")

public interface Replyaction extends GenericEntity, uml.Action {

	EntityType<Replyaction> T = EntityTypes.T(Replyaction.class);

	/* Constants for each property name. */
	java.lang.String replyToCall = "replyToCall";
	java.lang.String replyValue = "replyValue";
	java.lang.String returnInformation = "returnInformation";

	@Description("The Trigger specifying the Operation whose call is being replied to.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Trigger getReplyToCall();
	void setReplyToCall(uml.Trigger replyToCall);
	@Description("A list of InputPins providing the values for the output (inout, out, and return) Parameters of the Operation. These values are returned to the caller.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Inputpin> getReplyValue();
	void setReplyValue(java.util.List<uml.Inputpin> replyValue);

	@Description("An InputPin that holds the return information value produced by an earlier AcceptCallAction.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getReturnInformation();
	void setReturnInformation(uml.Inputpin returnInformation);
}
