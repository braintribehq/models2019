/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Duration of the Data Model uml.
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
{@link expr}, 
{@link observation}, 

* It provides of then following operations (getters and setters)
{@link getExpr},
{@link getObservation},
{@link setExpr},
{@link setObservation},
 */

@Description("A Duration is a ValueSpecification that specifies the temporal distance between two time instants.<p>From package UML::Values.</p>")

public interface Duration extends GenericEntity, uml.Valuespecification {

	EntityType<Duration> T = EntityTypes.T(Duration.class);

	/* Constants for each property name. */
	java.lang.String expr = "expr";
	java.lang.String observation = "observation";

	@Description("A ValueSpecification that evaluates to the value of the Duration.<p>From package UML::Values.</p>")
	@Mandatory
	uml.Valuespecification getExpr();
	void setExpr(uml.Valuespecification expr);
	@Description("Refers to the Observations that are involved in the computation of the Duration value<p>From package UML::Values.</p>")
	
	java.util.List<uml.Observation> getObservation();
	void setObservation(java.util.List<uml.Observation> observation);

}
