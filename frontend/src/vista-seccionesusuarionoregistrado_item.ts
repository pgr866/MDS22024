import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-seccionesusuarionoregistrado_item')
export class VistaSeccionesusuarionoregistrado_item extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-item selected id="Itemseccionesusuarionoregistrado">
 nombre_seccion
</vaadin-item>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
