/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcLightIntensityDistribution of the Data Model iai.
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
{@link LightDistributionCurve}, 
{@link DistributionData}, 

* It provides of then following operations (getters and setters)
{@link getLightDistributionCurve},
{@link getDistributionData},
{@link setLightDistributionCurve},
{@link setDistributionData},
 */

@Description("")

public interface IfcLightIntensityDistribution extends GenericEntity, ifc4.IfcLightDistributionDataSourceSelect {

	EntityType<IfcLightIntensityDistribution> T = EntityTypes.T(IfcLightIntensityDistribution.class);

	/* Constants for each property name. */
	java.lang.String LightDistributionCurve = "LightDistributionCurve";
	java.lang.String DistributionData = "DistributionData";

	@Description("")
	@Mandatory
	ifc4.IfcLightDistributionCurveEnum getLightDistributionCurve();
	void setLightDistributionCurve(ifc4.IfcLightDistributionCurveEnum LightDistributionCurve);
	@Description("")
	
	java.util.List<ifc4.IfcLightDistributionData> getDistributionData();
	void setDistributionData(java.util.List<ifc4.IfcLightDistributionData> DistributionData);

}
