import com.odmytrenko.shapes.Group;
import com.odmytrenko.shapes.Shape;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestConversionShapesToXMLAndJSON {

    @Mock
    private Shape shape;

    @InjectMocks
    private Group group = new Group(null);

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private static final String triangleAsJSON = "{\n" +
            "\tclass: Triangle,\n" +
            "\tproperties: {\n" +
            "\t\tedgea: 4.0,\n" +
            "\t\tedgeb: 4.0,\n" +
            "\t\tedgec: 1.0,\n" +
            "\t\theight: 3.0,\n" +
            "\t\tisequilateral: false,\n" +
            "\t\tisisosceles: true,\n" +
            "\t\tisscalene: false,\n" +
            "\t}\n" +
            "}";

    private static final String triangleAsXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<shape>\n" +
            "\t<class>Triangle</class>\n" +
            "\t<properties>\n" +
            "\t\t<property>\n" +
            "\t\t<edgea>4.0</edgea>\n" +
            "\t\t</property>\n" +
            "\t\t<property>\n" +
            "\t\t<edgeb>4.0</edgeb>\n" +
            "\t\t</property>\n" +
            "\t\t<property>\n" +
            "\t\t<edgec>1.0</edgec>\n" +
            "\t\t</property>\n" +
            "\t\t<property>\n" +
            "\t\t<height>3.0</height>\n" +
            "\t\t</property>\n" +
            "\t\t<property>\n" +
            "\t\t<isequilateral>false</isequilateral>\n" +
            "\t\t</property>\n" +
            "\t\t<property>\n" +
            "\t\t<isisosceles>true</isisosceles>\n" +
            "\t\t</property>\n" +
            "\t\t<property>\n" +
            "\t\t<isscalene>false</isscalene>\n" +
            "\t\t</property>\n" +
            "\t</properties>\n" +
            "</shape>";

    @Test
    public void shapeCallAddingToGroup() {
        group.addShapeToGroup(shape);
        verify(shape).setAddedToGroup();
    }

    @Test
    public void shouldReturnShapeAsJson() throws IllegalAccessException {
        when(shape.toJSON()).thenReturn(triangleAsJSON);

        Assert.assertEquals(triangleAsJSON, shape.toJSON());
    }

    @Test
    public void shouldReturnShapeAsXML() throws IllegalAccessException {
        when(shape.toJSON()).thenReturn(triangleAsXML);

        Assert.assertEquals(triangleAsXML, shape.toJSON());
    }
}
