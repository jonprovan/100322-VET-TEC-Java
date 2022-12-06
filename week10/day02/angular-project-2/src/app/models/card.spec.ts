import { Card } from './card';

describe('Card', () => {
  it('should create an instance', () => {
    expect(new Card('', '', '')).toBeTruthy();
  });
});
