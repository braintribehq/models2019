/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Literalunlimitednatural of the Data Model uml.
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
{@link value}, 

* It provides of then following operations (getters and setters)
{@link getValue},
{@link setValue},
 */

@Description("A LiteralUnlimitedNatural is a specification of an UnlimitedNatural number.<p>From package UML::Values.</p>")

public interface Literalunlimitednatural extends GenericEntity, uml.Literalspecification {

	EntityType<Literalunlimitednatural> T = EntityTypes.T(Literalunlimitednatural.class);

	/* Constants for each property name. */
	java.lang.String value = "value";

	@Description("The specified UnlimitedNatural value.<p>From package UML::Values.</p>")
	@Mandatory
	types.UnlimitedNatural getValue();
	void setValue(types.UnlimitedNatural value);
}
