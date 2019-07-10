/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Interval of the Data Model uml.
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
{@link max}, 
{@link min}, 

* It provides of then following operations (getters and setters)
{@link getMax},
{@link getMin},
{@link setMax},
{@link setMin},
 */

@Description("An Interval defines the range between two ValueSpecifications.<p>From package UML::Values.</p>")

public interface Interval extends GenericEntity, uml.Valuespecification {

	EntityType<Interval> T = EntityTypes.T(Interval.class);

	/* Constants for each property name. */
	java.lang.String max = "max";
	java.lang.String min = "min";

	@Description("Refers to the ValueSpecification denoting the maximum value of the range.<p>From package UML::Values.</p>")
	@Mandatory
	uml.Valuespecification getMax();
	void setMax(uml.Valuespecification max);
	@Description("Refers to the ValueSpecification denoting the minimum value of the range.<p>From package UML::Values.</p>")
	@Mandatory
	uml.Valuespecification getMin();
	void setMin(uml.Valuespecification min);
}
