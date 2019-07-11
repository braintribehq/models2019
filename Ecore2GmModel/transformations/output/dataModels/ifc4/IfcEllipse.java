/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcEllipse of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link SemiAxis1}, 
{@link SemiAxis1AsString}, 
{@link SemiAxis2}, 
{@link SemiAxis2AsString}, 

* It provides of then following operations (getters and setters)
{@link getSemiAxis1},
{@link getSemiAxis1AsString},
{@link getSemiAxis2},
{@link getSemiAxis2AsString},
{@link setSemiAxis1},
{@link setSemiAxis1AsString},
{@link setSemiAxis2},
{@link setSemiAxis2AsString},
 */

@Description("")

public interface IfcEllipse extends GenericEntity, ifc4.IfcConic {

	EntityType<IfcEllipse> T = EntityTypes.T(IfcEllipse.class);

	/* Constants for each property name. */
	java.lang.String SemiAxis1 = "SemiAxis1";
	java.lang.String SemiAxis1AsString = "SemiAxis1AsString";
	java.lang.String SemiAxis2 = "SemiAxis2";
	java.lang.String SemiAxis2AsString = "SemiAxis2AsString";

	@Description("")
	@Mandatory
	java.lang.Double getSemiAxis1();
	void setSemiAxis1(java.lang.Double SemiAxis1);
	@Description("")
	@Mandatory
	java.lang.String getSemiAxis1AsString();
	void setSemiAxis1AsString(java.lang.String SemiAxis1AsString);
	@Description("")
	@Mandatory
	java.lang.Double getSemiAxis2();
	void setSemiAxis2(java.lang.Double SemiAxis2);
	@Description("")
	@Mandatory
	java.lang.String getSemiAxis2AsString();
	void setSemiAxis2AsString(java.lang.String SemiAxis2AsString);
}
