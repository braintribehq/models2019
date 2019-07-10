/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Parameterset of the Data Model uml.
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
{@link condition}, 
{@link parameter}, 

* It provides of then following operations (getters and setters)
{@link getCondition},
{@link getParameter},
{@link setCondition},
{@link setParameter},
 */

@Description("A ParameterSet designates alternative sets of inputs or outputs that a Behavior may use.<p>From package UML::Classification.</p>")

public interface Parameterset extends GenericEntity, uml.Namedelement {

	EntityType<Parameterset> T = EntityTypes.T(Parameterset.class);

	/* Constants for each property name. */
	java.lang.String condition = "condition";
	java.lang.String parameter = "parameter";

	@Description("A constraint that should be satisfied for the owner of the Parameters in an input ParameterSet to start execution using the values provided for those Parameters, or the owner of the Parameters in an output ParameterSet to end execution providing the values for those Parameters, if all preconditions and conditions on input ParameterSets were satisfied.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Constraint> getCondition();
	void setCondition(java.util.List<uml.Constraint> condition);

	@Description("Parameters in the ParameterSet.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Parameter> getParameter();
	void setParameter(java.util.List<uml.Parameter> parameter);

}
