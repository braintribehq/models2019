/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMaterialLayerSetUsage of the Data Model iai.
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
{@link ForLayerSet}, 
{@link LayerSetDirection}, 
{@link DirectionSense}, 
{@link OffsetFromReferenceLine}, 
{@link OffsetFromReferenceLineAsString}, 
{@link ReferenceExtent}, 
{@link ReferenceExtentAsString}, 

* It provides of then following operations (getters and setters)
{@link getForLayerSet},
{@link getLayerSetDirection},
{@link getDirectionSense},
{@link getOffsetFromReferenceLine},
{@link getOffsetFromReferenceLineAsString},
{@link getReferenceExtent},
{@link getReferenceExtentAsString},
{@link setForLayerSet},
{@link setLayerSetDirection},
{@link setDirectionSense},
{@link setOffsetFromReferenceLine},
{@link setOffsetFromReferenceLineAsString},
{@link setReferenceExtent},
{@link setReferenceExtentAsString},
 */

@Description("")

public interface IfcMaterialLayerSetUsage extends GenericEntity, ifc4.IfcMaterialUsageDefinition {

	EntityType<IfcMaterialLayerSetUsage> T = EntityTypes.T(IfcMaterialLayerSetUsage.class);

	/* Constants for each property name. */
	java.lang.String ForLayerSet = "ForLayerSet";
	java.lang.String LayerSetDirection = "LayerSetDirection";
	java.lang.String DirectionSense = "DirectionSense";
	java.lang.String OffsetFromReferenceLine = "OffsetFromReferenceLine";
	java.lang.String OffsetFromReferenceLineAsString = "OffsetFromReferenceLineAsString";
	java.lang.String ReferenceExtent = "ReferenceExtent";
	java.lang.String ReferenceExtentAsString = "ReferenceExtentAsString";

	@Description("")
	@Mandatory
	ifc4.IfcMaterialLayerSet getForLayerSet();
	void setForLayerSet(ifc4.IfcMaterialLayerSet ForLayerSet);
	@Description("")
	@Mandatory
	ifc4.IfcLayerSetDirectionEnum getLayerSetDirection();
	void setLayerSetDirection(ifc4.IfcLayerSetDirectionEnum LayerSetDirection);
	@Description("")
	@Mandatory
	ifc4.IfcDirectionSenseEnum getDirectionSense();
	void setDirectionSense(ifc4.IfcDirectionSenseEnum DirectionSense);
	@Description("")
	@Mandatory
	java.lang.Double getOffsetFromReferenceLine();
	void setOffsetFromReferenceLine(java.lang.Double OffsetFromReferenceLine);
	@Description("")
	@Mandatory
	java.lang.String getOffsetFromReferenceLineAsString();
	void setOffsetFromReferenceLineAsString(java.lang.String OffsetFromReferenceLineAsString);
	@Description("")
	@Mandatory
	java.lang.Double getReferenceExtent();
	void setReferenceExtent(java.lang.Double ReferenceExtent);
	@Description("")
	@Mandatory
	java.lang.String getReferenceExtentAsString();
	void setReferenceExtentAsString(java.lang.String ReferenceExtentAsString);
}
