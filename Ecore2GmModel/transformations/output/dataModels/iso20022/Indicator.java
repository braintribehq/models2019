/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Indicator of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link meaningWhenTrue}, 
{@link meaningWhenFalse}, 

* It provides of then following operations (getters and setters)
{@link getMeaningWhenTrue},
{@link getMeaningWhenFalse},
{@link setMeaningWhenTrue},
{@link setMeaningWhenFalse},
 */

@Description("A list of exactly two mutually exclusive values that express the only two possible states of an instance of an object.")

public interface Indicator extends GenericEntity, iso20022.Boolean {

	EntityType<Indicator> T = EntityTypes.T(Indicator.class);

	/* Constants for each property name. */
	java.lang.String meaningWhenTrue = "meaningWhenTrue";
	java.lang.String meaningWhenFalse = "meaningWhenFalse";

	@Description("Provides the semantic meaning when the Indicator is set to true.")
	@Mandatory
	java.lang.String getMeaningWhenTrue();
	void setMeaningWhenTrue(java.lang.String meaningWhenTrue);
	@Description("Provides the semantic meaning when the Indicator is set to false.")
	@Mandatory
	java.lang.String getMeaningWhenFalse();
	void setMeaningWhenFalse(java.lang.String meaningWhenFalse);
}
