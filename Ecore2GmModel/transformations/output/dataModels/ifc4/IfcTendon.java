/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTendon of the Data Model iai.
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
{@link NominalDiameter}, 
{@link NominalDiameterAsString}, 
{@link CrossSectionArea}, 
{@link CrossSectionAreaAsString}, 
{@link TensionForce}, 
{@link TensionForceAsString}, 
{@link PreStress}, 
{@link PreStressAsString}, 
{@link FrictionCoefficient}, 
{@link FrictionCoefficientAsString}, 
{@link AnchorageSlip}, 
{@link AnchorageSlipAsString}, 
{@link MinCurvatureRadius}, 
{@link MinCurvatureRadiusAsString}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getNominalDiameter},
{@link getNominalDiameterAsString},
{@link getCrossSectionArea},
{@link getCrossSectionAreaAsString},
{@link getTensionForce},
{@link getTensionForceAsString},
{@link getPreStress},
{@link getPreStressAsString},
{@link getFrictionCoefficient},
{@link getFrictionCoefficientAsString},
{@link getAnchorageSlip},
{@link getAnchorageSlipAsString},
{@link getMinCurvatureRadius},
{@link getMinCurvatureRadiusAsString},
{@link setPredefinedType},
{@link setNominalDiameter},
{@link setNominalDiameterAsString},
{@link setCrossSectionArea},
{@link setCrossSectionAreaAsString},
{@link setTensionForce},
{@link setTensionForceAsString},
{@link setPreStress},
{@link setPreStressAsString},
{@link setFrictionCoefficient},
{@link setFrictionCoefficientAsString},
{@link setAnchorageSlip},
{@link setAnchorageSlipAsString},
{@link setMinCurvatureRadius},
{@link setMinCurvatureRadiusAsString},
 */

@Description("")

public interface IfcTendon extends GenericEntity, ifc4.IfcReinforcingElement {

	EntityType<IfcTendon> T = EntityTypes.T(IfcTendon.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String NominalDiameter = "NominalDiameter";
	java.lang.String NominalDiameterAsString = "NominalDiameterAsString";
	java.lang.String CrossSectionArea = "CrossSectionArea";
	java.lang.String CrossSectionAreaAsString = "CrossSectionAreaAsString";
	java.lang.String TensionForce = "TensionForce";
	java.lang.String TensionForceAsString = "TensionForceAsString";
	java.lang.String PreStress = "PreStress";
	java.lang.String PreStressAsString = "PreStressAsString";
	java.lang.String FrictionCoefficient = "FrictionCoefficient";
	java.lang.String FrictionCoefficientAsString = "FrictionCoefficientAsString";
	java.lang.String AnchorageSlip = "AnchorageSlip";
	java.lang.String AnchorageSlipAsString = "AnchorageSlipAsString";
	java.lang.String MinCurvatureRadius = "MinCurvatureRadius";
	java.lang.String MinCurvatureRadiusAsString = "MinCurvatureRadiusAsString";

	@Description("")
	@Mandatory
	ifc4.IfcTendonTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcTendonTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	java.lang.Double getNominalDiameter();
	void setNominalDiameter(java.lang.Double NominalDiameter);
	@Description("")
	@Mandatory
	java.lang.String getNominalDiameterAsString();
	void setNominalDiameterAsString(java.lang.String NominalDiameterAsString);
	@Description("")
	@Mandatory
	java.lang.Double getCrossSectionArea();
	void setCrossSectionArea(java.lang.Double CrossSectionArea);
	@Description("")
	@Mandatory
	java.lang.String getCrossSectionAreaAsString();
	void setCrossSectionAreaAsString(java.lang.String CrossSectionAreaAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTensionForce();
	void setTensionForce(java.lang.Double TensionForce);
	@Description("")
	@Mandatory
	java.lang.String getTensionForceAsString();
	void setTensionForceAsString(java.lang.String TensionForceAsString);
	@Description("")
	@Mandatory
	java.lang.Double getPreStress();
	void setPreStress(java.lang.Double PreStress);
	@Description("")
	@Mandatory
	java.lang.String getPreStressAsString();
	void setPreStressAsString(java.lang.String PreStressAsString);
	@Description("")
	@Mandatory
	java.lang.Double getFrictionCoefficient();
	void setFrictionCoefficient(java.lang.Double FrictionCoefficient);
	@Description("")
	@Mandatory
	java.lang.String getFrictionCoefficientAsString();
	void setFrictionCoefficientAsString(java.lang.String FrictionCoefficientAsString);
	@Description("")
	@Mandatory
	java.lang.Double getAnchorageSlip();
	void setAnchorageSlip(java.lang.Double AnchorageSlip);
	@Description("")
	@Mandatory
	java.lang.String getAnchorageSlipAsString();
	void setAnchorageSlipAsString(java.lang.String AnchorageSlipAsString);
	@Description("")
	@Mandatory
	java.lang.Double getMinCurvatureRadius();
	void setMinCurvatureRadius(java.lang.Double MinCurvatureRadius);
	@Description("")
	@Mandatory
	java.lang.String getMinCurvatureRadiusAsString();
	void setMinCurvatureRadiusAsString(java.lang.String MinCurvatureRadiusAsString);
}
