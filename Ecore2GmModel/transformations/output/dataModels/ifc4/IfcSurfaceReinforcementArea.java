/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSurfaceReinforcementArea of the Data Model iai.
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
{@link SurfaceReinforcement1}, 
{@link SurfaceReinforcement1AsString}, 
{@link SurfaceReinforcement2}, 
{@link SurfaceReinforcement2AsString}, 
{@link ShearReinforcement}, 
{@link ShearReinforcementAsString}, 

* It provides of then following operations (getters and setters)
{@link getSurfaceReinforcement1},
{@link getSurfaceReinforcement1AsString},
{@link getSurfaceReinforcement2},
{@link getSurfaceReinforcement2AsString},
{@link getShearReinforcement},
{@link getShearReinforcementAsString},
{@link setSurfaceReinforcement1},
{@link setSurfaceReinforcement1AsString},
{@link setSurfaceReinforcement2},
{@link setSurfaceReinforcement2AsString},
{@link setShearReinforcement},
{@link setShearReinforcementAsString},
 */

@Description("")

public interface IfcSurfaceReinforcementArea extends GenericEntity, ifc4.IfcStructuralLoadOrResult {

	EntityType<IfcSurfaceReinforcementArea> T = EntityTypes.T(IfcSurfaceReinforcementArea.class);

	/* Constants for each property name. */
	java.lang.String SurfaceReinforcement1 = "SurfaceReinforcement1";
	java.lang.String SurfaceReinforcement1AsString = "SurfaceReinforcement1AsString";
	java.lang.String SurfaceReinforcement2 = "SurfaceReinforcement2";
	java.lang.String SurfaceReinforcement2AsString = "SurfaceReinforcement2AsString";
	java.lang.String ShearReinforcement = "ShearReinforcement";
	java.lang.String ShearReinforcementAsString = "ShearReinforcementAsString";

	@Description("")
	
	java.util.List<java.lang.Double> getSurfaceReinforcement1();
	void setSurfaceReinforcement1(java.util.List<java.lang.Double> SurfaceReinforcement1);

	@Description("")
	
	java.util.List<java.lang.String> getSurfaceReinforcement1AsString();
	void setSurfaceReinforcement1AsString(java.util.List<java.lang.String> SurfaceReinforcement1AsString);

	@Description("")
	
	java.util.List<java.lang.Double> getSurfaceReinforcement2();
	void setSurfaceReinforcement2(java.util.List<java.lang.Double> SurfaceReinforcement2);

	@Description("")
	
	java.util.List<java.lang.String> getSurfaceReinforcement2AsString();
	void setSurfaceReinforcement2AsString(java.util.List<java.lang.String> SurfaceReinforcement2AsString);

	@Description("")
	@Mandatory
	java.lang.Double getShearReinforcement();
	void setShearReinforcement(java.lang.Double ShearReinforcement);
	@Description("")
	@Mandatory
	java.lang.String getShearReinforcementAsString();
	void setShearReinforcementAsString(java.lang.String ShearReinforcementAsString);
}
