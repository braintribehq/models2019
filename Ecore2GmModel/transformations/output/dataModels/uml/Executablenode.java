/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Executablenode of the Data Model uml.
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
{@link handler}, 

* It provides of then following operations (getters and setters)
{@link getHandler},
{@link setHandler},
 */

@Description("An ExecutableNode is an abstract class for ActivityNodes whose execution may be controlled using ControlFlows and to which ExceptionHandlers may be attached.<p>From package UML::Activities.</p>")
 
@Abstract 

public interface Executablenode extends GenericEntity, uml.Activitynode {

	EntityType<Executablenode> T = EntityTypes.T(Executablenode.class);

	/* Constants for each property name. */
	java.lang.String handler = "handler";

	@Description("A set of ExceptionHandlers that are examined if an exception propagates out of the ExceptionNode.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Exceptionhandler> getHandler();
	void setHandler(java.util.List<uml.Exceptionhandler> handler);

}
