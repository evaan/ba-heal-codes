package dev.evaan;

import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

public class HealCodeOverlay extends OverlayPanel {
    private final Client client;
    private final BAHealCodesPlugin plugin;
    private final BAHealCodesConfig config;

    @Inject
    HealCodeOverlay(Client client, BAHealCodesPlugin plugin, BAHealCodesConfig config) {
        setPosition(OverlayPosition.BOTTOM_LEFT);
        this.client = client;
        this.config = config;
        this.plugin = plugin;
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        panelComponent.getChildren().clear();
        panelComponent.setPreferredSize(new Dimension(150,0));

        if (!plugin.hasHealerHorn) return null;

        switch (plugin.wave) {
            case 4:
                panelComponent.getChildren().add(TitleComponent.builder().text("Wave 4 - " + config.wave4().getName()).color(ColorScheme.BRAND_ORANGE).build());
                for (LineComponent line : config.wave4().getLines()) {
                    panelComponent.getChildren().add(line);
                }
                break;
            case 5:
                panelComponent.getChildren().add(TitleComponent.builder().text("Wave 5 - " + config.wave5().getName()).color(ColorScheme.BRAND_ORANGE).build());
                for (LineComponent line : config.wave5().getLines()) {
                    panelComponent.getChildren().add(line);
                }
                break;
            case 6:
                panelComponent.getChildren().add(TitleComponent.builder().text("Wave 6 - " + config.wave6().getName()).color(ColorScheme.BRAND_ORANGE).build());
                for (LineComponent line : config.wave6().getLines()) {
                    panelComponent.getChildren().add(line);
                }
                break;
            case 7:
                panelComponent.getChildren().add(TitleComponent.builder().text("Wave 7 - " + config.wave7().getName()).color(ColorScheme.BRAND_ORANGE).build());
                for (LineComponent line : config.wave7().getLines()) {
                    panelComponent.getChildren().add(line);
                }
                break;
            case 8:
                panelComponent.getChildren().add(TitleComponent.builder().text("Wave 8 - " + config.wave8().getName()).color(ColorScheme.BRAND_ORANGE).build());
                for (LineComponent line : config.wave8().getLines()) {
                    panelComponent.getChildren().add(line);
                }
                break;
            case 9:
                panelComponent.getChildren().add(TitleComponent.builder().text("Wave 9 - " + config.wave9().getName()).color(ColorScheme.BRAND_ORANGE).build());
                for (LineComponent line : config.wave9().getLines()) {
                    panelComponent.getChildren().add(line);
                }
                break;
            case 10:
                panelComponent.getChildren().add(TitleComponent.builder().text("Wave 10 - " + config.wave10().getName()).color(ColorScheme.BRAND_ORANGE).build());
                for (LineComponent line : config.wave10().getLines()) {
                    panelComponent.getChildren().add(line);
                }
                break;
            default:
                return null;
        }

        return panelComponent.render(graphics);
    }
}
