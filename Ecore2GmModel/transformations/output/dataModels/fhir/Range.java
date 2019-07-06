/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Range of the Data Model fhir.
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
{@link low}, 
{@link high}, 

* It provides of then following operations (getters and setters)
{@link getLow},
{@link getHigh},
{@link setLow},
{@link setHigh},
 */

@Description("A set of ordered Quantities defined by a low and high limit.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface Range extends GenericEntity {

	EntityType<Range> T = EntityTypes.T(Range.class);

	/* Constants for each property name. */
	java.lang.String low = "low";
	java.lang.String high = "high";

	@Description("The low limit. The boundary is inclusive.")
	@Mandatory
	fhir.Quantity getLow();
	void setLow(fhir.Quantity low);
	@Description("The high limit. The boundary is inclusive.")
	@Mandatory
	fhir.Quantity getHigh();
	void setHigh(fhir.Quantity high);
}
