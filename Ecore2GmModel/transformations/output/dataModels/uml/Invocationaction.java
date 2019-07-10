/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Invocationaction of the Data Model uml.
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
{@link argument}, 
{@link onPort}, 

* It provides of then following operations (getters and setters)
{@link getArgument},
{@link getOnPort},
{@link setArgument},
{@link setOnPort},
 */

@Description("InvocationAction is an abstract class for the various actions that request Behavior invocation.<p>From package UML::Actions.</p>")
 
@Abstract 

public interface Invocationaction extends GenericEntity, uml.Action {

	EntityType<Invocationaction> T = EntityTypes.T(Invocationaction.class);

	/* Constants for each property name. */
	java.lang.String argument = "argument";
	java.lang.String onPort = "onPort";

	@Description("The InputPins that provide the argument values passed in the invocation request.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Inputpin> getArgument();
	void setArgument(java.util.List<uml.Inputpin> argument);

	@Description("For CallOperationActions, SendSignalActions, and SendObjectActions, an optional Port of the target object through which the invocation request is sent.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Port getOnPort();
	void setOnPort(uml.Port onPort);
}
