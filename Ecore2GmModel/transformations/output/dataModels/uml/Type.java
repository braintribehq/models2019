/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Type of the Data Model uml.
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
{@link package_}, 

* It provides of then following operations (getters and setters)
{@link getPackage_},
{@link setPackage_},
 */

@Description("A Type constrains the values represented by a TypedElement.<p>From package UML::CommonStructure.</p>")
 
@Abstract 

public interface Type extends GenericEntity, uml.Packageableelement {

	EntityType<Type> T = EntityTypes.T(Type.class);

	/* Constants for each property name. */
	java.lang.String package_ = "package_";

	@Description("Specifies the owning Package of this Type, if any.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Package getPackage_();
	void setPackage_(uml.Package package_);
}
