/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcReinforcingMesh of the Data Model iai.
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
{@link MeshLength}, 
{@link MeshLengthAsString}, 
{@link MeshWidth}, 
{@link MeshWidthAsString}, 
{@link LongitudinalBarNominalDiameter}, 
{@link LongitudinalBarNominalDiameterAsString}, 
{@link TransverseBarNominalDiameter}, 
{@link TransverseBarNominalDiameterAsString}, 
{@link LongitudinalBarCrossSectionArea}, 
{@link LongitudinalBarCrossSectionAreaAsString}, 
{@link TransverseBarCrossSectionArea}, 
{@link TransverseBarCrossSectionAreaAsString}, 
{@link LongitudinalBarSpacing}, 
{@link LongitudinalBarSpacingAsString}, 
{@link TransverseBarSpacing}, 
{@link TransverseBarSpacingAsString}, 
{@link PredefinedType}, 

* It provides of then following operations (getters and setters)
{@link getMeshLength},
{@link getMeshLengthAsString},
{@link getMeshWidth},
{@link getMeshWidthAsString},
{@link getLongitudinalBarNominalDiameter},
{@link getLongitudinalBarNominalDiameterAsString},
{@link getTransverseBarNominalDiameter},
{@link getTransverseBarNominalDiameterAsString},
{@link getLongitudinalBarCrossSectionArea},
{@link getLongitudinalBarCrossSectionAreaAsString},
{@link getTransverseBarCrossSectionArea},
{@link getTransverseBarCrossSectionAreaAsString},
{@link getLongitudinalBarSpacing},
{@link getLongitudinalBarSpacingAsString},
{@link getTransverseBarSpacing},
{@link getTransverseBarSpacingAsString},
{@link getPredefinedType},
{@link setMeshLength},
{@link setMeshLengthAsString},
{@link setMeshWidth},
{@link setMeshWidthAsString},
{@link setLongitudinalBarNominalDiameter},
{@link setLongitudinalBarNominalDiameterAsString},
{@link setTransverseBarNominalDiameter},
{@link setTransverseBarNominalDiameterAsString},
{@link setLongitudinalBarCrossSectionArea},
{@link setLongitudinalBarCrossSectionAreaAsString},
{@link setTransverseBarCrossSectionArea},
{@link setTransverseBarCrossSectionAreaAsString},
{@link setLongitudinalBarSpacing},
{@link setLongitudinalBarSpacingAsString},
{@link setTransverseBarSpacing},
{@link setTransverseBarSpacingAsString},
{@link setPredefinedType},
 */

@Description("")

public interface IfcReinforcingMesh extends GenericEntity, ifc4.IfcReinforcingElement {

	EntityType<IfcReinforcingMesh> T = EntityTypes.T(IfcReinforcingMesh.class);

	/* Constants for each property name. */
	java.lang.String MeshLength = "MeshLength";
	java.lang.String MeshLengthAsString = "MeshLengthAsString";
	java.lang.String MeshWidth = "MeshWidth";
	java.lang.String MeshWidthAsString = "MeshWidthAsString";
	java.lang.String LongitudinalBarNominalDiameter = "LongitudinalBarNominalDiameter";
	java.lang.String LongitudinalBarNominalDiameterAsString = "LongitudinalBarNominalDiameterAsString";
	java.lang.String TransverseBarNominalDiameter = "TransverseBarNominalDiameter";
	java.lang.String TransverseBarNominalDiameterAsString = "TransverseBarNominalDiameterAsString";
	java.lang.String LongitudinalBarCrossSectionArea = "LongitudinalBarCrossSectionArea";
	java.lang.String LongitudinalBarCrossSectionAreaAsString = "LongitudinalBarCrossSectionAreaAsString";
	java.lang.String TransverseBarCrossSectionArea = "TransverseBarCrossSectionArea";
	java.lang.String TransverseBarCrossSectionAreaAsString = "TransverseBarCrossSectionAreaAsString";
	java.lang.String LongitudinalBarSpacing = "LongitudinalBarSpacing";
	java.lang.String LongitudinalBarSpacingAsString = "LongitudinalBarSpacingAsString";
	java.lang.String TransverseBarSpacing = "TransverseBarSpacing";
	java.lang.String TransverseBarSpacingAsString = "TransverseBarSpacingAsString";
	java.lang.String PredefinedType = "PredefinedType";

	@Description("")
	@Mandatory
	java.lang.Double getMeshLength();
	void setMeshLength(java.lang.Double MeshLength);
	@Description("")
	@Mandatory
	java.lang.String getMeshLengthAsString();
	void setMeshLengthAsString(java.lang.String MeshLengthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getMeshWidth();
	void setMeshWidth(java.lang.Double MeshWidth);
	@Description("")
	@Mandatory
	java.lang.String getMeshWidthAsString();
	void setMeshWidthAsString(java.lang.String MeshWidthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLongitudinalBarNominalDiameter();
	void setLongitudinalBarNominalDiameter(java.lang.Double LongitudinalBarNominalDiameter);
	@Description("")
	@Mandatory
	java.lang.String getLongitudinalBarNominalDiameterAsString();
	void setLongitudinalBarNominalDiameterAsString(java.lang.String LongitudinalBarNominalDiameterAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTransverseBarNominalDiameter();
	void setTransverseBarNominalDiameter(java.lang.Double TransverseBarNominalDiameter);
	@Description("")
	@Mandatory
	java.lang.String getTransverseBarNominalDiameterAsString();
	void setTransverseBarNominalDiameterAsString(java.lang.String TransverseBarNominalDiameterAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLongitudinalBarCrossSectionArea();
	void setLongitudinalBarCrossSectionArea(java.lang.Double LongitudinalBarCrossSectionArea);
	@Description("")
	@Mandatory
	java.lang.String getLongitudinalBarCrossSectionAreaAsString();
	void setLongitudinalBarCrossSectionAreaAsString(java.lang.String LongitudinalBarCrossSectionAreaAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTransverseBarCrossSectionArea();
	void setTransverseBarCrossSectionArea(java.lang.Double TransverseBarCrossSectionArea);
	@Description("")
	@Mandatory
	java.lang.String getTransverseBarCrossSectionAreaAsString();
	void setTransverseBarCrossSectionAreaAsString(java.lang.String TransverseBarCrossSectionAreaAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLongitudinalBarSpacing();
	void setLongitudinalBarSpacing(java.lang.Double LongitudinalBarSpacing);
	@Description("")
	@Mandatory
	java.lang.String getLongitudinalBarSpacingAsString();
	void setLongitudinalBarSpacingAsString(java.lang.String LongitudinalBarSpacingAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTransverseBarSpacing();
	void setTransverseBarSpacing(java.lang.Double TransverseBarSpacing);
	@Description("")
	@Mandatory
	java.lang.String getTransverseBarSpacingAsString();
	void setTransverseBarSpacingAsString(java.lang.String TransverseBarSpacingAsString);
	@Description("")
	@Mandatory
	ifc4.IfcReinforcingMeshTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcReinforcingMeshTypeEnum PredefinedType);
}
