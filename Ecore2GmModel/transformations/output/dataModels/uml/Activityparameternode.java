/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Activityparameternode of the Data Model uml.
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
{@link parameter}, 

* It provides of then following operations (getters and setters)
{@link getParameter},
{@link setParameter},
 */

@Description("An ActivityParameterNode is an ObjectNode for accepting values from the input Parameters or providing values to the output Parameters of an Activity.<p>From package UML::Activities.</p>")

public interface Activityparameternode extends GenericEntity, uml.Objectnode {

	EntityType<Activityparameternode> T = EntityTypes.T(Activityparameternode.class);

	/* Constants for each property name. */
	java.lang.String parameter = "parameter";

	@Description("The Parameter for which the ActivityParameterNode will be accepting or providing values.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Parameter getParameter();
	void setParameter(uml.Parameter parameter);
}
