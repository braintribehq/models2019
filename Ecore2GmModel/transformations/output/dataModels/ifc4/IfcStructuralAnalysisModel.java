/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralAnalysisModel of the Data Model iai.
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
{@link PredefinedType}, 
{@link OrientationOf2DPlane}, 
{@link LoadedBy}, 
{@link HasResults}, 
{@link SharedPlacement}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getOrientationOf2DPlane},
{@link getLoadedBy},
{@link getHasResults},
{@link getSharedPlacement},
{@link setPredefinedType},
{@link setOrientationOf2DPlane},
{@link setLoadedBy},
{@link setHasResults},
{@link setSharedPlacement},
 */

@Description("")

public interface IfcStructuralAnalysisModel extends GenericEntity, ifc4.IfcSystem {

	EntityType<IfcStructuralAnalysisModel> T = EntityTypes.T(IfcStructuralAnalysisModel.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String OrientationOf2DPlane = "OrientationOf2DPlane";
	java.lang.String LoadedBy = "LoadedBy";
	java.lang.String HasResults = "HasResults";
	java.lang.String SharedPlacement = "SharedPlacement";

	@Description("")
	@Mandatory
	ifc4.IfcAnalysisModelTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcAnalysisModelTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	ifc4.IfcAxis2Placement3D getOrientationOf2DPlane();
	void setOrientationOf2DPlane(ifc4.IfcAxis2Placement3D OrientationOf2DPlane);
	@Description("")
	
	java.util.List<ifc4.IfcStructuralLoadGroup> getLoadedBy();
	void setLoadedBy(java.util.List<ifc4.IfcStructuralLoadGroup> LoadedBy);

	@Description("")
	
	java.util.List<ifc4.IfcStructuralResultGroup> getHasResults();
	void setHasResults(java.util.List<ifc4.IfcStructuralResultGroup> HasResults);

	@Description("")
	@Mandatory
	ifc4.IfcObjectPlacement getSharedPlacement();
	void setSharedPlacement(ifc4.IfcObjectPlacement SharedPlacement);
}
